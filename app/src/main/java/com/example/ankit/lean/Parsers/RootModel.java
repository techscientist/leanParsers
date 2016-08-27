import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String location_name;
	public String type;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String state;
	public String email;
	public VersionModel _version;
	public String logo;
	public int id;
	public String timezone;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String name;
	public String background_image;
	public String end_time;
	public String organizer_description;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public CopyrightModel _copyright;
	public String description;

	public RootModel(String privacy, String location_name, String type, String schedule_published_on, CreatorModel creator, String state, String email, VersionModel version, String logo, int id, String timezone, String organizer_name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String name, String background_image, String end_time, String organizer_description, String start_time, Call_for_papersModel call_for_papers, String topic, CopyrightModel copyright, String description) {

		this.privacy = privacy;
		this.location_name = location_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.state = state;
		this.email = email;
		this._version = version;
		this.logo = logo;
		this.id = id;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this._copyright = copyright;
		this.description = description;

	}

}