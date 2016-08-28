import java.util.ArrayList;

class RootModel {

	public String description;
	public String privacy;
	public String schedule_published_on;
	public String end_time;
	public String location_name;
	public VersionModel _version;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public int id;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String topic;
	public CreatorModel _creator;
	public String organizer_name;
	public String organizer_description;
	public String state;
	public String type;
	public String timezone;
	public String logo;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;

	public RootModel(String description, String privacy, String schedule_published_on, String end_time, String location_name, VersionModel version, String name, Call_for_papersModel call_for_papers, String background_image, int id, String code_of_conduct, CopyrightModel copyright, String topic, CreatorModel creator, String organizer_name, String organizer_description, String state, String type, String timezone, String logo, String start_time, ArrayList<Social_linksModel> social_links, String email) {

		this.description = description;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.location_name = location_name;
		this._version = version;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.topic = topic;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.type = type;
		this.timezone = timezone;
		this.logo = logo;
		this.start_time = start_time;
		this.social_links = social_links;
		this.email = email;

	}

}