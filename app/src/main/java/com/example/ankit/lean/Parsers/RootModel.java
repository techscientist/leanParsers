import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String background_image;
	public String email;
	public String state;
	public String type;
	public String name;
	public String privacy;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public String logo;
	public String start_time;
	public String timezone;
	public String organizer_description;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String location_name;

	public RootModel(CreatorModel creator, String organizer_name, CopyrightModel copyright, String code_of_conduct, String background_image, String email, String state, String type, String name, String privacy, VersionModel version, ArrayList<Social_linksModel> social_links, String description, String schedule_published_on, String end_time, String topic, String logo, String start_time, String timezone, String organizer_description, int id, Call_for_papersModel call_for_papers, String location_name) {

		this._creator = creator;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.email = email;
		this.state = state;
		this.type = type;
		this.name = name;
		this.privacy = privacy;
		this._version = version;
		this.social_links = social_links;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this.logo = logo;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;

	}

}