import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String organizer_name;
	public VersionModel _version;
	public int id;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String privacy;
	public String location_name;
	public String email;
	public String state;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String type;
	public String timezone;
	public String background_image;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String description;
	public String organizer_description;
	public String logo;

	public RootModel(CreatorModel creator, String organizer_name, VersionModel version, int id, String code_of_conduct, CopyrightModel copyright, String schedule_published_on, String privacy, String location_name, String email, String state, String name, ArrayList<Social_linksModel> social_links, String topic, String type, String timezone, String background_image, String end_time, Call_for_papersModel call_for_papers, String start_time, String description, String organizer_description, String logo) {

		this._creator = creator;
		this.organizer_name = organizer_name;
		this._version = version;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.location_name = location_name;
		this.email = email;
		this.state = state;
		this.name = name;
		this.social_links = social_links;
		this.topic = topic;
		this.type = type;
		this.timezone = timezone;
		this.background_image = background_image;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.description = description;
		this.organizer_description = organizer_description;
		this.logo = logo;

	}

}