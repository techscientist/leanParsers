import java.util.ArrayList;

class RootModel {

	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String logo;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String type;
	public String state;
	public String background_image;
	public int id;
	public String end_time;
	public String organizer_name;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;
	public String topic;
	public CreatorModel _creator;
	public String email;
	public String privacy;

	public RootModel(String start_time, Call_for_papersModel call_for_papers, String timezone, String logo, String location_name, ArrayList<Social_linksModel> social_links, String organizer_description, String description, CopyrightModel copyright, String schedule_published_on, String type, String state, String background_image, int id, String end_time, String organizer_name, String name, String code_of_conduct, VersionModel version, String topic, CreatorModel creator, String email, String privacy) {

		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.logo = logo;
		this.location_name = location_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.description = description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.state = state;
		this.background_image = background_image;
		this.id = id;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.topic = topic;
		this._creator = creator;
		this.email = email;
		this.privacy = privacy;

	}

}