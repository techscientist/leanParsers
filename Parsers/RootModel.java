import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String start_time;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String privacy;
	public VersionModel _version;
	public String code_of_conduct;
	public String location_name;
	public String end_time;
	public String timezone;
	public String description;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String topic;
	public String schedule_published_on;
	public String type;
	public String name;
	public String state;
	public int id;
	public String email;

	public RootModel(String organizer_name, String start_time, CreatorModel creator, CopyrightModel copyright, String privacy, VersionModel version, String code_of_conduct, String location_name, String end_time, String timezone, String description, String organizer_description, ArrayList<Social_linksModel> social_links, String logo, Call_for_papersModel call_for_papers, String background_image, String topic, String schedule_published_on, String type, String name, String state, int id, String email) {

		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._creator = creator;
		this._copyright = copyright;
		this.privacy = privacy;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.end_time = end_time;
		this.timezone = timezone;
		this.description = description;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.name = name;
		this.state = state;
		this.id = id;
		this.email = email;

	}

}