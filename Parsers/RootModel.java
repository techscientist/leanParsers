import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String location_name;
	public String topic;
	public String logo;
	public String end_time;
	public String organizer_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String state;
	public String email;
	public String organizer_description;
	public int id;
	public String background_image;
	public VersionModel _version;
	public String type;
	public CopyrightModel _copyright;
	public String name;
	public String timezone;
	public String description;

	public RootModel(String code_of_conduct, ArrayList<Social_linksModel> social_links, String start_time, String location_name, String topic, String logo, String end_time, String organizer_name, String schedule_published_on, CreatorModel creator, Call_for_papersModel call_for_papers, String privacy, String state, String email, String organizer_description, int id, String background_image, VersionModel version, String type, CopyrightModel copyright, String name, String timezone, String description) {

		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.start_time = start_time;
		this.location_name = location_name;
		this.topic = topic;
		this.logo = logo;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.state = state;
		this.email = email;
		this.organizer_description = organizer_description;
		this.id = id;
		this.background_image = background_image;
		this._version = version;
		this.type = type;
		this._copyright = copyright;
		this.name = name;
		this.timezone = timezone;
		this.description = description;

	}

}