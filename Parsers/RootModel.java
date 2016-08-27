import java.util.ArrayList;

class RootModel {

	public String state;
	public String code_of_conduct;
	public String schedule_published_on;
	public String start_time;
	public String location_name;
	public String organizer_name;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String email;
	public String type;
	public int id;
	public VersionModel _version;
	public String topic;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String end_time;
	public CreatorModel _creator;
	public String background_image;
	public String description;

	public RootModel(String state, String code_of_conduct, String schedule_published_on, String start_time, String location_name, String organizer_name, String organizer_description, CopyrightModel copyright, String email, String type, int id, VersionModel version, String topic, String name, Call_for_papersModel call_for_papers, String privacy, String logo, ArrayList<Social_linksModel> social_links, String timezone, String end_time, CreatorModel creator, String background_image, String description) {

		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.email = email;
		this.type = type;
		this.id = id;
		this._version = version;
		this.topic = topic;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this.end_time = end_time;
		this._creator = creator;
		this.background_image = background_image;
		this.description = description;

	}

}